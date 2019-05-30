package com.balan.sergii.nn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.balan.sergii.nn.dto.FileProperties;
import com.balan.sergii.nn.service.ConnectorService;

@RestController
@RequestMapping(value = "/file",
				produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseStatus(HttpStatus.OK)
public class ConnectorController {
	
	@Autowired
	private ConnectorService connectorService;
	
	@PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public FileProperties upload(@RequestParam("file") MultipartFile file) {
		return connectorService.upload(file);
    }
}