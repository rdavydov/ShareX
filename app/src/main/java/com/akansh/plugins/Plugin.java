package com.akansh.plugins;

public class Plugin {
    private final String plugin_uid;
    private final String plugin_name;
    private final String plugin_package_name;
    private final String plugin_description;
    private final String plugin_author;
    private final String plugin_version;
    private final int plugin_version_code;

    public Plugin(String plugin_uid, String plugin_name, String plugin_package_name, String plugin_description, String plugin_author, String plugin_version, int plugin_version_code) {
        this.plugin_uid = plugin_uid;
        this.plugin_name = plugin_name;
        this.plugin_package_name = plugin_package_name;
        this.plugin_description = plugin_description;
        this.plugin_author = plugin_author;
        this.plugin_version = plugin_version;
        this.plugin_version_code = plugin_version_code;
    }

    public String getPlugin_uid() {
        return plugin_uid;
    }

    public String getPlugin_name() {
        return plugin_name;
    }

    public String getPlugin_package_name() {
        return plugin_package_name;
    }

    public String getPlugin_description() {
        return plugin_description;
    }

    public String getPlugin_author() {
        return plugin_author;
    }

    public String getPlugin_version() {
        return plugin_version;
    }

    public int getPlugin_version_code() {
        return plugin_version_code;
    }
}
