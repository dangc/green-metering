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
@RequestMapping("/v1.0")
public class MeteringMeterResource {
    private MeterService meterService;

    public MeteringMeterResource(MeterService meterService) {
        this.meterService = meterService;
    }

    @ApiOperation(value = "미터별 전력사용량 (LP) 조회", notes = "IF-GND-METER-001")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "Integer", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "channel", value = "채널", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/lp"})
    public ResponseMessage getLPMeteringByMeter(@RequestHeader HttpHeaders headers, LPMetering lpMetering){
        System.out.println(lpMetering.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringByMeter(lpMetering));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = new ResponseMessage(ResultCode.Y, result);
        if(result != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            String errMsg = ErrorCode.E2001.getMsg();
            responseMessage = new ResponseMessage(ResultCode.N, ErrorCode.E2001, errMsg);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 채널별 전력사용량 (LP) 조회", notes = "IF-GND-METER-002")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "Integer", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/lpByChannel"})
    public ResponseMessage getLPMeteringByChannel(@RequestHeader HttpHeaders headers, LPMetering lpMetering){
        System.out.println(lpMetering.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringByChannel(lpMetering));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = new ResponseMessage(ResultCode.Y, result);
        if(result != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            String errMsg = ErrorCode.E2001.getMsg();
            responseMessage = new ResponseMessage(ResultCode.N, ErrorCode.E2001, errMsg);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 검침데이터 (정기검침) 조회", notes = "IF-GND-METER-003")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "Integer", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/billing"})
    public ResponseMessage getLPMeteringBilling(@RequestHeader HttpHeaders headers, LPMetering lpMetering){
        System.out.println(lpMetering.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringBilling(lpMetering));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = new ResponseMessage(ResultCode.Y, result);
        if(result != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            String errMsg = ErrorCode.E2001.getMsg();
            responseMessage = new ResponseMessage(ResultCode.N, ErrorCode.E2001, errMsg);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 검침데이터 (월별최대수요) 조회", notes = "IF-GND-METER-004")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "Integer", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/monthly-demand"})
    public ResponseMessage getLPMeteringMonthlyDemand(@RequestHeader HttpHeaders headers, LPMetering lpMetering){
        System.out.println(lpMetering.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringMonthlyDemand(lpMetering));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = new ResponseMessage(ResultCode.Y, result);
        if(result != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            String errMsg = ErrorCode.E2001.getMsg();
            responseMessage = new ResponseMessage(ResultCode.N, ErrorCode.E2001, errMsg);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터별 미터 이벤트 이력 조회", notes = "IF-GND-METER-005")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "Integer", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "eventCd", value = "이벤트코드", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterId}/events-log"})
    public ResponseMessage getLPMeteringEventLog(@RequestHeader HttpHeaders headers, LPMetering lpMetering){
        System.out.println(lpMetering.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringEventLog(lpMetering));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = new ResponseMessage(ResultCode.Y, result);
        if(result != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            String errMsg = ErrorCode.E2001.getMsg();
            responseMessage = new ResponseMessage(ResultCode.N, ErrorCode.E2001, errMsg);
        }

        return responseMessage;
    }

    @ApiOperation(value = "미터타입별 LP 채널 조회", notes = "IF-GND-METER-010")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "Integer", paramType = "path", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/meters/{meterType}/channels"})
    public ResponseMessage getLPMeteringChannel(@RequestHeader HttpHeaders headers, LPChannel lpChannel){
        System.out.println(lpChannel.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterService.getLPMeteringChannel(lpChannel));
        result.setTotalCnt(result.getDatas().size());

        ResponseMessage responseMessage = new ResponseMessage(ResultCode.Y, result);
        if(result != null && result.getDatas().size() != 0) {
            responseMessage = new ResponseMessage(ResultCode.Y, result);
        } else {
            String errMsg = ErrorCode.E2001.getMsg();
            responseMessage = new ResponseMessage(ResultCode.N, ErrorCode.E2001, errMsg);
        }

        return responseMessage;
    }
}
