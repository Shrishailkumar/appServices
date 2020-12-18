package com.example.serviceapilibrary.Nw;

public class ServiceApiDataFeeder {

    private static String BASE_URL = null;
    private static String GET_HERO_API_END_NODE_NAME = null;
    private static ServiceApiDataFeeder mServiceApiDataFeeder = null;

    public static Object getmHero() {
        return mHero;
    }

    public static void setmHero(Object mHero) {
        ServiceApiDataFeeder.mHero = mHero;
    }

    private static Object mHero = null;
    private ServiceApiDataFeeder() {

    }

    synchronized public static ServiceApiDataFeeder getInstance() {
            if (null == mServiceApiDataFeeder) {
                return new ServiceApiDataFeeder();
            } else {
                return mServiceApiDataFeeder;
            }
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static void setBaseUrl(String baseUrl) {
        BASE_URL = baseUrl;
    }

    public static String getGetHeroApiEndNodeName() {
        return GET_HERO_API_END_NODE_NAME;
    }

    public static void setGetHeroApiEndNodeName(String getHeroApiEndNodeName) {
        GET_HERO_API_END_NODE_NAME = getHeroApiEndNodeName;
    }



}
