//package org.goodsManagement.util;
//
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by never on 2015/9/19.
// */
//public class GeneratorSqlmap {
//    public void generate()
//    {
//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
//        File configFile = new File("generatorConfig.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate(null);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
