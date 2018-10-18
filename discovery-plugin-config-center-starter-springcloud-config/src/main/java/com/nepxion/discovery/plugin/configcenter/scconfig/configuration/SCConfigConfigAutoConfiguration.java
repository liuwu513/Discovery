package com.nepxion.discovery.plugin.configcenter.scconfig.configuration;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nepxion.discovery.common.scconfig.constant.SCConfigConstant;
import com.nepxion.discovery.plugin.configcenter.adapter.ConfigAdapter;
import com.nepxion.discovery.plugin.configcenter.scconfig.adapter.SCConfigConfigAdapter;

@Configuration
public class SCConfigConfigAutoConfiguration {
    static {
        System.out.println("");
        System.out.println("╔═══╗           ╔═══╦╗        ╔╗╔═══╗      ╔═╗");
        System.out.println("║╔═╗║           ║╔═╗║║        ║║║╔═╗║      ║╔╝");
        System.out.println("║╚══╦══╦═╦╦═╗╔══╣║ ╚╣║╔══╦╗╔╦═╝║║║ ╚╬══╦═╗╔╝╚╦╦══╗");
        System.out.println("╚══╗║╔╗║╔╬╣╔╗╣╔╗║║ ╔╣║║╔╗║║║║╔╗║║║ ╔╣╔╗║╔╗╬╗╔╬╣╔╗║");
        System.out.println("║╚═╝║╚╝║║║║║║║╚╝║╚═╝║╚╣╚╝║╚╝║╚╝║║╚═╝║╚╝║║║║║║║║╚╝║");
        System.out.println("╚═══╣╔═╩╝╚╩╝╚╩═╗╠═══╩═╩══╩══╩══╝╚═══╩══╩╝╚╝╚╝╚╩═╗║");
        System.out.println("    ║║       ╔═╝║                             ╔═╝║");
        System.out.println("    ╚╝       ╚══╝                             ╚══╝");
        System.out.println(SCConfigConstant.TYPE + " Config");
        System.out.println("");
    }

    @Bean
    public ConfigAdapter configAdapter() {
        return new SCConfigConfigAdapter();
    }
}