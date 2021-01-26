package com.nuri.green.metering.rest;

import com.nuri.green.metering.common.ErrorCode;
import com.nuri.green.metering.common.ResultCode;
import com.nuri.green.metering.entity.*;
import com.nuri.green.metering.page.PagingGridResult;
import com.nuri.green.metering.response.ResponseMessage;
import com.nuri.green.metering.spec.MeterAptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@Api(description = "단지별 전력사용량 조회 Resource")
@RequestMapping("/green/v1.0")
public class MeteringAptResource {
    private MeterAptService meterAptService;

    public MeteringAptResource(MeterAptService meterAptService) {
        this.meterAptService = meterAptService;
    }

    @ApiOperation(value = "단지별 전력사용량 (LP) 조회", notes = "IF-GND-METER-006")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "aptNo", value = "단지코드", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/lp"})
    public ResponseMessage getLPMeteringByApt(@RequestHeader HttpHeaders headers, LPMeteringApt lpMeteringApt){
        System.out.println(lpMeteringApt.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringByApt(lpMeteringApt));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "단지별 검침데이터 (정기검침) 조회", notes = "IF-GND-METER-007")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/billing"})
    public ResponseMessage getLPMeteringAptBilling(@RequestHeader HttpHeaders headers, LPMeteringAptBilling lpMeteringAptBilling){
        System.out.println(lpMeteringAptBilling.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringAptBilling(lpMeteringAptBilling));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "단지별 검침데이터 (월별최대수요) 조회", notes = "IF-GND-METER-008")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/monthly-demand"})
    public ResponseMessage getLPMeteringAptMonthlyDemand(@RequestHeader HttpHeaders headers, LPMeteringAptBilling lpMeteringAptBilling){
        System.out.println(lpMeteringAptBilling.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringAptMonthlyDemand(lpMeteringAptBilling));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "단지별 미터 이벤트 이력 조회", notes = "IF-GND-METER-009")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/events-log"})
    public ResponseMessage getLPMeteringAptEventLog(@RequestHeader HttpHeaders headers, LPMeteringAptEvent lpMeteringAptEvent){
        System.out.println(lpMeteringAptEvent.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringAptEventLog(lpMeteringAptEvent));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

}
