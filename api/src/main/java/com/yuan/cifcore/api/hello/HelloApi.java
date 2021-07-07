package com.yuan.cifcore.api.hello;

import com.bench.common.model.JsonResult;
import com.yuan.cifcore.api.hello.request.SayHelloRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @author by cold
 * @date 2020/12/15
 */
@FeignClient(name = "helloApi", url = "${rpc.cifcore.url}", fallbackFactory = HelloApiFallback.class)
public interface HelloApi {

    /**
     * 打个招呼
     *
     * @param request 打招呼请求
     * @return 回应
     */
    JsonResult<String> sayHello(@Valid @RequestBody SayHelloRequest request);
}
