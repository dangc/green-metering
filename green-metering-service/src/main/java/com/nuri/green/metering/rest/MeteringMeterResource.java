package com.nuri.green.metering.rest;

import com.nuri.green.metering.common.ErrorCode;
import com.nuri.green.metering.common.ResultCode;
import com.nuri.green.metering.entity.*;
import com.nuri.green.metering.page.PagingGridResult;
import com.nuri.green.metering.response.ResponseMessage;
import com.nuri.green.metering.spec.MeterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@Api(description = "미터별 전력사용량 조회 Resource")
@RequestMapping("/green/v1.0")
public class MeteringMeterResource {
    private MeterService meterService;

    public MeteringMeterResource(MeterService meterService) {
        this.meterService = meterService;
    }

    @ApiOperation(value = "미터별 전력사용량 (LP) 조회", notes = "IF-GND-METER-001")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/lp"})
    public ResponseMessage getLPMeteringByMeter(@RequestHeader HttpHeaders headers, LPMetering lpMetering){
        System.out.println(lpMetering.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringByMeter(lpMetering));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 채널별 전력사용량 (LP) 조회", notes = "IF-GND-METER-002")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/lpByChannel"})
    public ResponseMessage getLPMeteringByChannel(@RequestHeader HttpHeaders headers, LPMeteringByChannel lpMeteringByChannel){
        System.out.println(lpMeteringByChannel.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringByChannel(lpMeteringByChannel));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 검침데이터 (정기검침) 조회", notes = "IF-GND-METER-003")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/billing"})
    public ResponseMessage getLPMeteringBilling(@RequestHeader HttpHeaders headers, LPMeteringByChannel lpMeteringByChannel){
        System.out.println(lpMeteringByChannel.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringBilling(lpMeteringByChannel));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 검침데이터 (월별최대수요) 조회", notes = "IF-GND-METER-004")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/monthly-demand"})
    public ResponseMessage getLPMeteringMonthlyDemand(@RequestHeader HttpHeaders headers, LPMeteringByChannel lpMeteringByChannel){
        System.out.println(lpMeteringByChannel.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringMonthlyDemand(lpMeteringByChannel));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 미터 이벤트 이력 조회", notes = "IF-GND-METER-005")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/events-log"})
    public ResponseMessage getLPMeteringEventLog(@RequestHeader HttpHeaders headers, LPMeteringEvent lpMeteringEvent){
        System.out.println(lpMeteringEvent.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringEventLog(lpMeteringEvent));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = null;

        if (result.getDatas() != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            responseMessage = new ResponseMessage(ResultCode.N, result);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터타입별 LP 채널 조회", notes = "IF-GND-METER-010")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterType", value = "미터 타입", required = true, paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterType}/channels"})
    public ResponseMessage getLPMeteringChannel(@RequestHeader HttpHeaders headers, LPChannel lpChannel){
        System.out.println(lpChannel.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringChannel(lpChannel));
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
