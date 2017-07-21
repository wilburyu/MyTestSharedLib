package com.osterhoutgroup.sharedlibraryplugin.http;

import java.util.List;

public class ApplicationRequest {
    public String name; // required
    public String company; // required
    public String description;
    public double price; // required
    public String website;
    public Long category; // required
    public List<Long> productModelIds;
    public List<Long> buildTypeIds;
    public List<Long> regionIds;
    public List<String> testers;
}
