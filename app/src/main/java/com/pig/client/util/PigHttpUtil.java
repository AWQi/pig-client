package com.pig.client.util;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.pig.client.pojo.Breeder;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.pojo.Pigsty;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PigHttpUtil {
////static  final  public String HOST = "192.168.225.133:8080";
    static  final  public String HOST = "10.0.2.2:8080";

//    static  final  public String HOST = "192.168.137.1:8080";
    static  final  public  int NETWORK_FAIL = 111;
    private static final String TAG = "PigHttpUtil";





    static  public final Type BREED_LIST_TYPE = new TypeToken<PigResult.PigList<BreedingPig>>() {}.getType();
    static  final private  String BREED_PIG_QUERY_ALL =  "http://"+HOST+"/BreedingPig/queryAll";
    static public  void  queryAllBreed(PigHttpCallBack pigHttpCallBack){
        pigPostHttp(BREED_PIG_QUERY_ALL,null,null,null,pigHttpCallBack);
    }

    static public  final  Type PIGSTY_LIST_TYPE = new TypeToken<PigResult.PigList<Pigsty>>() {}.getType();
    static final  private String PIGSTY_QUERY_ALL =  "http://"+HOST+"/Pigsty/queryAll";
    static public  void  queryAllPigsty(PigHttpCallBack pigHttpCallBack){
        pigPostHttp(PIGSTY_QUERY_ALL,null,null,null,pigHttpCallBack);
    }

    static public  final  Type BREEDER_LIST_TYPE = new TypeToken<PigResult.PigList<Breeder>>() {}.getType();
    static final  private String BREEDER_QUERY_ALL =  "http://"+HOST+"/Breeder/queryAll";
    static public  void  queryAllBreeder(PigHttpCallBack pigHttpCallBack){
        pigPostHttp(BREEDER_QUERY_ALL,null,null,null,pigHttpCallBack);
    }


//    static Handler handler = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            if (msg.what==NETWORK_FAIL){
//                Toast.makeText(ApplicationUtil.getContext(),"获取网络数据失败", Toast.LENGTH_SHORT).show();
//            }
//        }
//    };

    /**
     *    发送http 并解析,返回数据 到  PigResult  可以使用回调函数处理
     *
     */
    static  public  void pigPostHttp(final String url, final String body, final Map<String,String> head  , final Map<String,String> params, final PigHttpCallBack pigHttpCallBack){

        new Thread(new Runnable() {
            @Override
            public void run() {
                //10.0.2.2 shi 相对于模拟器来讲主机的地址 10.0.2.3是模拟器的地址
                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(15000L, TimeUnit.MILLISECONDS)
                        .readTimeout(30000L, TimeUnit.MILLISECONDS)
                        .addInterceptor(new Interceptor() {
                            @Override
                            public Response intercept(Chain chain) throws IOException { Request original = chain.request();

                                /**
                                 *    添加1   尾部  参数
                                 */
                                HttpUrl originalHttpUrl = original.url();
                                HttpUrl.Builder httpBuilder  = originalHttpUrl.newBuilder();
                                if (params!=null) {
                                    for (String key : params.keySet()) {
                                        httpBuilder = httpBuilder.addQueryParameter(key, params.get(key));
                                    }
                                }
                                HttpUrl url = httpBuilder.build();
                                /**
                                 *    添加   head  参数
                                 */
                                Request.Builder requestBuilder = original.newBuilder().url(url);
                                if (head!=null) {
                                    for (String key : head.keySet()) {
                                        requestBuilder = requestBuilder.addHeader(key, head.get(key));
                                    }
                                }
                                Request request = requestBuilder.build();
                                return chain.proceed(request);
                            }
                        }).build();

                String realBody = null;
                if (body==null){
                    realBody = "";
                }else {
                    realBody = body;
                }
                RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"),realBody);
                Request request =  new Request.Builder().url(url).post(requestBody).build();
                //
                Call call = client.newCall(request);
                // 执行异步请求
                call.enqueue(pigHttpCallBack);

            }
        }).start();
    }


   static public  abstract class    PigHttpCallBack implements Callback {

        protected   PigResultCallBack  pigResultCallBack ;
        protected   PigListCallBack  pigListCallBack;
        protected   PigObjCallBack pigObjCallBack;
        protected Class clazz =null;
        protected Type type;
        @Override
        public void onFailure(Call call, IOException e) {
//            PigResult joyResult = new PigResult(300,"请求失败");
//            joyResultCallBack.analyticData(joyResult);

//            Message msg  = new Message();
//            msg.what = NETWORK_FAIL;
//            handler.sendMessage(msg);
//                    Toast.makeText(context,"网络连接错误",Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onFailure: -------------------------"+"获取网络数据失败");
            Log.d(TAG, "onFailure: "+e.getMessage());


        }
        @Override
        public void onResponse(Call call, Response response) throws IOException {
            String jsonStr = response.body().string();
            Log.d(TAG, "onResponse: "+jsonStr);
            int a = jsonStr.indexOf("[");

            try {
                if (a!=-1){// 传入泛型  解析Json
                    Gson gson = new Gson();
                    PigResult.PigList joyList =gson.fromJson(jsonStr,type);
    //                Log.d(TAG, "joyList: "+joyList.getData());
                    pigListCallBack.analyticData(joyList);
                }else {
                    Gson gson = new Gson();
                    PigResult.PigObj joyObj =gson.fromJson(jsonStr,type);
    //                PigResult.JoyObj joyObj =  JsonUtil.StrToObj(jsonStr, type);
                    pigObjCallBack.analyticData(joyObj);
                }
            } catch (JsonSyntaxException e) {
                Log.d(TAG, "网络数据解析错误------------------------------------ ");
                Log.d(TAG, e.getMessage());
                e.printStackTrace();
            }


        }



    }
    static  abstract  public  class PigResultCallBack extends  PigHttpCallBack{
        public PigResultCallBack() {
            pigResultCallBack = this;
        }
        abstract public  void analyticData(PigResult pigResult);
    }
    static  abstract  public  class PigListCallBack extends PigHttpCallBack{
        public PigListCallBack(Type type) {
            pigListCallBack = this;
            this.type =type;
        }

        abstract public  void analyticData(PigResult.PigList pigList);
    }
    static  abstract  public  class PigObjCallBack extends  PigHttpCallBack{
        public PigObjCallBack(Type type) {
            pigObjCallBack = this;
            this.type =type;
        }
        abstract public  void analyticData(PigResult.PigObj pigObj);
    }
}
