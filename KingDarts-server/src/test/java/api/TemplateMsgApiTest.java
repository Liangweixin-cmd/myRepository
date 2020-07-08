package api;

import com.github.pagehelper.Page;
import com.jfinal.weixin.sdk.api.ApiResult;
import com.jfinal.weixin.sdk.api.TemplateData;
import com.jfinal.weixin.sdk.api.TemplateMsgApi;
import org.springframework.data.crossstore.HashMapChangeSet;

import java.util.*;

/**
 * 模板消息测试
 * @author L.cm
 * email: 596392912@qq.com
 * site:http://www.dreamlu.net
 * date: 2015年9月9日 下午11:03:48
 */
public class TemplateMsgApiTest {

    public static String loadSetMethodName(String filedName){
        return "set" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1);
    }
	//sssssss
    public static void main(String[] args) {
        // 模板消息，发送测试：pass
//    	https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1433751277
        /*ApiResult result = TemplateMsgApi.send(TemplateData.New()
            // 消息接收者
            .setTouser("oOGf-jgjmwxFVU66D-lFO2AFK8ic")
            // 模板id
            .setTemplate_id("UsOTFJfm7-XfskPd5p2wlBXYUjdwjUTZxnMXbOfVQ0A")
            .setUrl("http://m.xxxx.cn/qrcode/t/xxxxxx")

            // 模板参数
            .add("first", "验票成功！\n", "#999")
            .add("keyword1", "xxxxxx", "#999")
            .add("keyword2", "2014年12月27日 19:30", "#999")
            .add("keyword3", "xxxxx", "#999")
            .add("keyword4", "xxxxxxxx", "#999")
            .add("keyword5", "xxx元", "#999")
            .add("remark", "\nxxxxxxxxxx。", "#999")
            .build());

        System.out.println(result);*/
//        HashMap<String,String> map = new HashMap<>();
//        map.put("1","11");
//        map.put("2","222");
//        map.get("3");
//    //    map.clear();
//        map=null;
////        ArrayList<Map> list = new ArrayList<>();
//        list.add(null);
//        list.add(null);
//        list.add(map);
     //   String A =loadSetMethodName("is_publish");
        String A ="[123,456,789,990]";
        String ns = A.replaceAll("[^0-9a-zA-Z\u4e00-\u9fa5.，,。？“”]+","");
        String [] B = ns.split(",");
        List<String> list=Arrays.asList(B);
        for(String str : list){
            System.out.println("str"+str);
        }
        System.out.println("返回"+list);
    }
}
