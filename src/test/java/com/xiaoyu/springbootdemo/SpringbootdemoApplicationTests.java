package com.xiaoyu.springbootdemo;

import com.xiaoyu.springbootdemo.domain.User;
import com.xiaoyu.springbootdemo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {


	@Autowired
	private UserMapper userMapper;

	@Test
	public void test(){
		userMapper.insert("a","123","12345678");
		User u = userMapper.findUserByPhone("12345678");
		Assert.assertEquals("a",u.getName());
	}

}
