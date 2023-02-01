package com.meilisearch.sdk;

public class Version {
    static final String VERSION = "0.9.0";

    public static String getQualifiedVersion() {
        return "Meilisearch Java (v" + VERSION + ")";
    }
}