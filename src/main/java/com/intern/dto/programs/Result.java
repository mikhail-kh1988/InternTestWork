package com.intern.dto.programs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
@Getter
@Setter
public class Result{
    private int id;
    private String name;
    private String name_aliases;
    private String site_url;
    private String description;
    private String raw_description;
    private String currency;
    private String rating;
    private double ecpc;
    private double epc;
    private double cr;
    private ArrayList<Region> regions;
    private ArrayList<Category> categories;
    private String status;
    private String image;
    private Object ecpc_trend;
    private Object epc_trend;
    private String cr_trend;
    private boolean exclusive;
    private Date activation_date;
    private Date modified_date;
    private boolean denynewwms;
    private int goto_cookie_lifetime;
    private boolean retag;
    private boolean show_products_links;
    private Object landing_code;
    private Object landing_title;
    private boolean geotargeting;
    private Object max_hold_time;
    private ArrayList<Traffic> traffics;
    private int avg_hold_time;
    private int avg_money_transfer_time;
    private boolean allow_deeplink;
    private boolean coupon_iframe_denied;
    private Object action_testing_limit;
    private Object mobile_device_type;
    private Object mobile_os;
    private Object mobile_os_type;
    private boolean allow_actions_all_countries;
    private boolean connected;
    private ArrayList<String> action_countries;
    private ArrayList<Action> actions;
    private ArrayList<ActionsDetail> actions_detail;
    private Object feeds_info;
    private String gotolink;
    private Object products_csv_link;
    private Object products_xml_link;
    private Object actions_limit;
    private Object actions_limit_24;
    private boolean moderation;
    private String connection_status;
}