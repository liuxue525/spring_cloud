package com.fh.utils;


import com.alibaba.fastjson.JSONObject;
import com.fh.entity.po.Log;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {

    public static void main(String[] args) {
        Log Log=new Log();
        Log.setAuthor("郑阳");
        Log.setContent("100");
        Log.setId(1);
        Log.setIp("160.169");
        set("logData",Log);
        String logData = get("logData");
        System.out.print(logData);
    }
    private static JedisPool jedisPool;
    //创建一个代码块
    static{
        //设置连接池
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        //设置最大连接最连接
        poolConfig.setMinIdle(2);
        poolConfig.setMaxIdle(10);
        jedisPool =new JedisPool(poolConfig,"192.168.235.129",6379);
    }

    public static String get(String key){
        Jedis resource = jedisPool.getResource();
        String s = resource.get(key);
        jedisPool.returnResource(resource);
        return s;
    }

    //设置值的方法
    public static String set(String key,Object data){
        String s = JSONObject.toJSONString(data);
        Jedis resource = jedisPool.getResource();
        String set = resource.set(key, s);
        jedisPool.returnResource(resource);
        return set;
    }


}
