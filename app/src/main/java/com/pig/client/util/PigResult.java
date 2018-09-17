package com.pig.client.util;

import java.util.List;

public class PigResult<T>{

    // 响应业务状态
    public int status;
    // 响应消息
    public String msg;
    public PigResult(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    public int getStatus() {
        return status;
    }
    public String getMsg() {
        return msg;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    static  public class  PigObj<T>{
        public T data;
        // 响应业务状态
        public int status;
        // 响应消息
        public String msg;

        public PigObj(T data, int status, String msg) {
            this.data = data;
            this.status = status;
            this.msg = msg;
        }
        public Object getData() {
            return data;
        }
        public int getStatus() {
            return status;
        }
        public String getMsg() {
            return msg;
        }
        public void setData(T data) {
            this.data = data;
        }
        public void setStatus(int status) {
            this.status = status;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
    }



    static public  class  PigList <T> {
        // 响应业务状态
        private int status;
        // 响应消息
        private String msg;
        private List<T> data = null;
        public int getStatus() {
            return status;
        }
        public String getMsg() {
            return msg;
        }
        public void setStatus(int status) {
            this.status = status;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
        public void setData(List data) {
            this.data = data;
        }
        public List getData() {
            return data;
        }
    }








    //    // 响应中的数据
//    private Object  data;
//    public PigResult() {
//    }
//    public PigResult(Integer status, String msg, String data) {
//        this.status = status;
//        this.msg = msg;
//        this.data = data;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public PigResult(int status, String msg) {
//        this.status = status;
//        this.msg = msg;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//    public String getMsg() {
//        return msg;
//    }
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public <T> List<T> getList(Class clazz) {
//            return JsonUtil.StrToList(string(),clazz);
//    }
//    public  <T> T getObj(Class clazz){
//            return  JsonUtil.StrToObj(string(),clazz);
//    }
//
//    public  String string(){
//        return data.toString();
//    }
//    public void setStatus(int status) {
//        this.status = status;
//    }
//    public void setData(Object data) {
//        this.data = data;
//    }
////
////    public <T>T getDataObj(Class objClass){
////        return (T)JsonUtil.StrToObj(getData(),objClass);
////    }
////    public List<T> getDataList(){
////        return JsonUtil.StrToList(getData());
////    }
//
//
//    public  static <T> PigResult formatObjJoyResult(String jsonStr,Class clazz){
//        try {
//            JSONObject jsonObject = null;
//           jsonObject = new JSONObject(jsonStr);
//           int status = (int) jsonObject.get("status");
//           String msg  = (String) jsonObject.get("msg");
//           JSONArray data = jsonObject.getJSONArray("data");
//
//           List<T>  list = new ArrayList<>();
////            for (int i = 0;i<data.length();i++) {
////                T t = data.fromJson(user, new TypeToken<UserBean>() {}.getType());
////                userBeanList.add(userBean);
////            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//    }
//

}

