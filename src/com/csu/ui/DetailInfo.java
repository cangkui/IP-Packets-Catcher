/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csu.ui;

/**
 *
 * @author csu_cangkui
 */
public class DetailInfo {
    // Packet Analyze
    private int cap_len;
    private int packet_len;
    private String header;
    private int header_len;
    private String data;
    private int data_leng;
    
    // Enthernet Header Infomation
    private String src_mac;
    private String dst_mac;
    private String frame_type;
    
    private String ipv;
    private String service_type;
    private int priority;
    private int pac_len;
    private String identification;
    private boolean dont_frag;
    private boolean more_frag;
    private int frag_off;
    private int time_live;
    private String protocol;
    
}
