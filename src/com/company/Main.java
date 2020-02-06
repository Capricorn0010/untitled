package com.company;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.NameValuePair;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
//        System.out.println("hello word!");
//        //String url = "http://192.168.68.98:8065/customJco/pingJco";
//        String url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wxb211fcdcdf49a58a&corpsecret=T3rhkFfxeelLoxSFbnQKgjMW5WPC2YsvcSKtktcajxw";
//
//        HttpUtil httpUtil = new HttpUtil();
//        System.out.println(httpUtil.sendGet(url));

        //解析json
//        String jsonStr = "{\"msg\":\"success\",\"code\":0,\"data\":{\"I_ADDRESS\":[{\"CITY\":\"\",\"COUNTRY\":\"\",\"POSTL_COD1\":\"\",\"TEL1_EXT\":\"\",\"TEL1_NUMBR\":\"\",\"STREET\":\"\",\"NAME\":\"\"}],\"T_RETURN\":[{\"MESSAGE\":\"成功生成订单\",\"EBELN\":\"4700031562\",\"TYPE\":\"S\"}]}}";


        String temp="{\"msg\":\"success\",\"code\":0,\"data\":{\"E_EBELN\":\"4800009236\",\"ET_RETURN\":[{\"MESSAGE\":\"成功生成订单\",\"EBELN\":\"4800009236\",\"TYPE\":\"S\"}],\"IT_ADDRESS\":[],\"IT_ITEM\":[{\"KOSTL\":\"\",\"PSTYP\":\"\",\"WERKS\":\"6001\",\"LGORT\":\"1001\",\"FREE_ITEM\":\"\",\"KNTTP\":\"F\",\"SAKTO\":\"50010411\",\"MENGE\":\"8000.000\",\"PEINH\":\"8000\",\"MEINS\":\"PC\",\"INFNR\":\"\",\"AUFNR\":\"400004104\",\"EINDT\":\"2020-01-03\",\"NETPR\":\"500.000000000\",\"MATKL\":\"A0201\",\"ANLN1\":\"\",\"MWSKZ\":\"J2\",\"TXZ01\":\"线割\",\"MATNR\":\"\"}],\"E_FRGSX\":\"S4\",\"IT_HEADER\":[{\"BUKRS\":\"CH06\",\"EKGRP\":\"609\",\"EKORG\":\"0610\",\"WAERS\":\"CNY\",\"INCO2\":\"\",\"INCO1\":\"\",\"LIFNR\":\"12412\"}]}}";
        JSONObject jsonObject = JSONObject.parseObject(temp);
        JSONObject jsonObject_data = JSONObject.parseObject(jsonObject.getString("data"));
//        JSONArray jsonArray = jsonObject_data.getJSONArray("E_EBELN");

        System.out.println( jsonObject_data.getString("E_EBELN"));

//        for (int i = 0; i < jsonArray.size(); i++) {
//            JSONObject object = jsonArray.getJSONObject(i);
//            String MESSAGE = object.getString("MESSAGE");
//            System.out.println(MESSAGE);
//            String EBELN = object.getString("EBELN");
//            System.out.println(EBELN);
//        }

    }
}
