package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HospitalMsg;
import com.example.demo.entity.MedicalService;

@RestController
@RequestMapping("/miniprogram")
public class MiniProgramController {
   
	//获取图片URL
	@RequestMapping("/getMainRes")
	public Map<String, Object> getImgs(){
		Map<String, Object> map = new HashMap<String,Object>();
		List<String> Imglist = new ArrayList<String>();
		Imglist.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583160409643&di=b9086edf405f37ed08b4125ddb9ec4b9&imgtype=0&src=http%3A%2F%2Fwww.danzhou.gov.cn%2Fdanzhou%2Fywdt%2Fmtkdz%2F201808%2FW020180822349695705317.jpg");
		Imglist.add("http://www.ludedc.com/userfiles/image/20160624/24110456a0e9f3003d5682.jpg");
		Imglist.add("http://images.hainanfz.com/Files/pic/InfoContentPic/2015-12-17/8ff2f363-5881-41a1-b92b-a9e332f3fb5f_autowaterimg.jpg");
		List<MedicalService> medicalServices = new ArrayList<MedicalService>();
        MedicalService ms1 = new MedicalService(1, "/images/icon/我的.png", "在线建档", "new");
        MedicalService ms2 = new MedicalService(1, "/images/icon/医生.png", "预约挂号", "reserve");
        MedicalService ms3 = new MedicalService(1, "/images/icon/付费.png", "门诊缴费", "pay");
        MedicalService ms4 = new MedicalService(1, "/images/icon/报告.png", "检查报告", "report");
        medicalServices.add(ms1);
        medicalServices.add(ms2);
        medicalServices.add(ms3);
        medicalServices.add(ms4);
        List<HospitalMsg> hospitalMsgs = new ArrayList<HospitalMsg>();
        HospitalMsg hm1 = new HospitalMsg(1, "医院简介", "hospital");
        HospitalMsg hm2 = new HospitalMsg(1, "门诊介绍", "outpatient");
        HospitalMsg hm3 = new HospitalMsg(1, "专家介绍", "doctorMsg");
        hospitalMsgs.add(hm1);
        hospitalMsgs.add(hm2);
        hospitalMsgs.add(hm3);
		map.put("list", Imglist);
		map.put("medicalservice", medicalServices);
		map.put("webserviceinfo", hospitalMsgs);
		return map;
	}
}
