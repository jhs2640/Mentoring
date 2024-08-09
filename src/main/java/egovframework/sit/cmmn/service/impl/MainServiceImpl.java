package egovframework.sit.cmmn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.sit.cmmn.service.MainService;

@Service("mainService")
public class MainServiceImpl implements MainService{
	
	@Resource(name="mainMapper")
	private MainMapper mainMapper;

	@Override
	public List<EgovMap> selectMainList() {
		return mainMapper.selectMainList();
	}

}
