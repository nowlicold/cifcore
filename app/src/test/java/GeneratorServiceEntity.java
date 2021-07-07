import static com.baomidou.mybatisplus.annotation.IdType.ASSIGN_ID;
import static com.baomidou.mybatisplus.generator.config.rules.DateType.ONLY_DATE;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.bench.lang.base.string.utils.StringUtils;
import org.junit.Test;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class GeneratorServiceEntity {

    private static final String dbUrl
            = "jdbc:mysql://192.168.1.151:30001/cifcore?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static final String packageName = "com.yuan.cifcore.repository";
    private static final String userName = "cifcore";
    private static final String password = "cifcore";
    private static final String outPutDir = "../repository/src/main/java";
    private static final Boolean serviceNameStartWithI = false;

    @Test
    public void generateAllCode() {
        generateByTables(serviceNameStartWithI, packageName, StringUtils.split("cfg_app_task_execue_config,cfg_app_task_mutex,cif_canceled_one_auth,cif_canceled_user,cif_cell_black,cif_domain_config,cif_forbidden,cif_forbidden_action_type,cif_forbidden_log,cif_level_property,cif_one_auth,cif_one_auth_log,cif_one_auth_login_name,cif_one_auth_login_process,cif_one_auth_login_pwd_verify,cif_one_auth_platform_config,cif_one_auth_platform_login,cif_one_auth_register,cif_one_auth_validated_cell,cif_register_from_cfg_domain,cif_register_from_config,cif_register_from_type,cif_registrable_cell,cif_sub_domain_config,cif_system_logo,cif_system_logo_group,cif_third_one_auth_mapping,cif_third_one_auth_mapping_cfg,cif_third_one_auth_mapping_his,cif_third_user_mapping,cif_third_user_mapping_config,cif_third_user_mapping_his,cif_user,cif_user_account_pwd_verify,cif_user_bak,cif_user_current_ip,cif_user_ext,cif_user_geographic,cif_user_geographic_his,cif_user_id_mapping,cif_user_ip_history,cif_user_key,cif_user_key_config,cif_user_level,cif_user_log,cif_user_login_name,cif_user_login_name_change_log,cif_user_login_name_deleted,cif_user_login_process,cif_user_login_pwd_verify,cif_user_logo,cif_user_logo_gather,cif_user_platform_config,cif_user_platform_login,cif_user_profile,cif_user_register,cif_user_relation,cif_user_role,cif_user_role_name_change_log,cif_user_type,cif_user_validated_cell,one_auth_identity_photo,one_auth_identity_photo_apply,one_auth_login_name_deleted,sch_distribute_task_exec_conf,sch_interval_task_info,sch_interval_task_info_his,sys_app_task_execute_config,sys_app_task_execute_mutex,sys_bench_config,sys_bench_config_his,sys_byte_storage_content,sys_byte_storage_index,sys_config,sys_config_his,sys_event_config,sys_event_handle_conf,sys_message_recv_config,sys_message_recv_handle,sys_message_recv_listener_conf,sys_message_send_config,sys_message_send_transfer_cfg,sys_monitor_collect_config,sys_rule,sys_script,sys_sequence,sys_short_url,sys_template,sys_text_storage_content,sys_text_storage_index,sys_thread_pool_config,user_identity_change_apply,user_identity_change_apply_img",","));
    }

   @Test
    public void generateOnlyEntity() {
        generateEntity(serviceNameStartWithI, packageName, "cif_user");
    }

    private void generateEntity(boolean serviceNameStartWithI, String packageName,
                                String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl).setUsername(userName)
                .setPassword(password)
                .setDriverName("com.mysql.cj.jdbc.Driver");

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(false)
                .setChainModel(true)
                .setEntityLombokModel(true)
                .setControllerMappingHyphenStyle(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames)
                .setEntityColumnConstant(true).setTablePrefix("CIF");

        //修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setOpen(false)
                .setAuthor("cold_auto")
                .setOutputDir(outPutDir)
                .setDateType(ONLY_DATE)
                .setIdType(ASSIGN_ID)
                .setFileOverride(false)
                .setEnableCache(true)
                .setControllerName(null)
                .setEnableCache(false)
                .setBaseColumnList(true)
                .setBaseResultMap(false)
                .setSwagger2(true);

        if (!serviceNameStartWithI) {
            config.setServiceName("%sRpService");
            config.setServiceImplName("%sRpServiceImpl");
            config.setEntityName("%sDO");

        }

        TemplateConfig tc = new TemplateConfig();
        //不生成controller,service,mapper,xml,仅生成实体
        tc.setController(null);
        tc.setService(null);
        tc.setServiceImpl(null);
        //tc.setMapper(null);
        //tc.setXml(null);
        //tc.setEntity("templates/custom.entity.java.vm");
        //tc.setEntity(null);
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setTemplate(tc)
                .setPackageInfo(new PackageConfig()
                        .setParent(packageName)
                        .setMapper("mapper")
                        .setXml("mapper")
                        .setEntity("entity"))
                .execute();
    }

    private static void generateByTables(boolean serviceNameStartWithI, String packageName,
                                         String... tableNames) {

        GlobalConfig config = new GlobalConfig();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl).setUsername(userName)
                .setPassword(password)
                .setDriverName("com.mysql.jdbc.Driver");

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(false)
                .setChainModel(true)
                .setEntityLombokModel(true)
                .setControllerMappingHyphenStyle(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames)
                .setEntityColumnConstant(true)
                .setLogicDeleteFieldName("del")
                .setVersionFieldName("version").setTablePrefix("CIF");

        //修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setOpen(false)
                .setAuthor("cold")
                .setOutputDir(outPutDir)
                .setDateType(ONLY_DATE)
                .setIdType(ASSIGN_ID)
                .setEnableCache(true)
                .setFileOverride(false)
                .setControllerName(null)
                .setEnableCache(false)
                .setBaseColumnList(true)
                .setBaseResultMap(false)
                .setSwagger2(true);

        if (!serviceNameStartWithI) {
            config.setServiceName("%sRpService");
            config.setServiceImplName("%sRpServiceImpl");
            config.setEntityName("%sDO");
        }

        TemplateConfig tc = new TemplateConfig();
        //不生成controller,service
        tc.setController(null);

        //tc.setService(null);
        //tc.setServiceImpl(null);
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setTemplate(tc)
                .setPackageInfo(new PackageConfig()
                        .setParent(packageName)
                        .setEntity("entity")
                        .setMapper("mapper")
                        .setXml("mapper")
                        .setService("service"))
                .execute();

    }

}
