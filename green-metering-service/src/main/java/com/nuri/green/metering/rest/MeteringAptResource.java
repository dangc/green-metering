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
@RequestMapping("/v1.0")
public class MeteringAptResource {
    private MeterAptService meterAptService;

    public MeteringAptResource(MeterAptService meterAptService) {
        this.meterAptService = meterAptService;
    }

    @ApiOperation(value = "단지별 전력사용량 (LP) 조회", notes = "IF-GND-METER-006")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "aptNo", value = "단지코드", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터아이디", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "measurementPointId", value = "계측점 관리키", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "channel", value = "채널", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/lp"})
    public ResponseMessage getLPMeteringByApt(@RequestHeader HttpHeaders headers, LPMeteringApt lpMeteringApt){
        System.out.println(lpMeteringApt.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringByApt(lpMeteringApt));
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

    @ApiOperation(value = "단지별 검침데이터 (정기검침) 조회", notes = "IF-GND-METER-007")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/billing"})
    public ResponseMessage getLPMeteringAptBilling(@RequestHeader HttpHeaders headers, LPMeteringApt lpMeteringApt){
        System.out.println(lpMeteringApt.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringAptBilling(lpMeteringApt));
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

    @ApiOperation(value = "단지별 검침데이터 (월별최대수요) 조회", notes = "IF-GND-METER-008")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/monthly-demand"})
    public ResponseMessage getLPMeteringAptMonthlyDemand(@RequestHeader HttpHeaders headers, LPMeteringApt lpMeteringApt){
        System.out.println(lpMeteringApt.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringAptMonthlyDemand(lpMeteringApt));
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

    @ApiOperation(value = "단지별 미터 이벤트 이력 조회", notes = "IF-GND-METER-009")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "regionId", value = "region 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "meterId", value = "미터 아이디", required = true, dataType = "string", paramType = "path", defaultValue = ""),
            @ApiImplicitParam(name = "eventCd", value = "이벤트코드", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "startDate", value = "검침시작일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "endDate", value = "검침종료일자", required = true, dataType = "string", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "limit", value = "Grid 리스트 수", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "offset", value = "데이터 커서 위치", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
            @ApiImplicitParam(name = "page", value = "현재 페이지", required = true, dataType = "Integer", paramType = "query", defaultValue = "")
    })
    @GetMapping(value={"regions/{regionId}/apts/{aptNo}/events-log"})
    public ResponseMessage getLPMeteringAptEventLog(@RequestHeader HttpHeaders headers, LPMeteringApt lpMeteringApt){
        System.out.println(lpMeteringApt.toString());

        PagingGridResult result = new PagingGridResult();
        result.setDatas(this.meterAptService.getLPMeteringAptEventLog(lpMeteringApt));
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
