package com.one.generator;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // global config
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir("C:\\Users\\Anita\\Workspace\\Guns\\guns-main\\src\\main\\java")
                .setAuthor("andy")
                .setOpen(true)
                .setSwagger2(true);

        mpg.setGlobalConfig(globalConfig);

        // datasource
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/guns?useUnicode=true&useSSL=false&characterEncoding=utf8")
        // dsc.setSchemaName("public");
       .setDriverName("com.mysql.jdbc.Driver")
       .setUsername("root")
       .setPassword("root");
        mpg.setDataSource(dsc);

        //package config
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("guns-main");
        pc.setParent("com.one");
        mpg.setPackageInfo(pc);

        // injection configuration
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.btl";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        String basePath = "C:\\Users\\Anita\\Workspace\\Guns\\guns-main";
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return basePath + "\\src\\main\\resources\\mapper\\" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);


        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 公共父类
//        strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
        // 写于父类中的公共字段
        strategy.setSuperEntityColumns("id");
        strategy.setInclude("customer", "integral_record","invitation_info", "pay_info", "register_code","payment_info");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new BeetlTemplateEngine());
        mpg.execute();

    }

}
