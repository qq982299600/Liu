package generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorApp {

    /**
     * 使用时请务必提交所有代码到git上
     *
     * 使用前检查修改 generatorConfig.xml 文件
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception {
        List<String> warnings = new ArrayList();
        boolean overwrite = true;
        File configFile = new File(
                "D:\\myWork\\workspace\\richmanKf\\richman-admin-api\\src\\test\\generator\\generatorConfig.xml");

        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}