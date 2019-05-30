package com.balan.sergii.nn.service;

import org.springframework.web.multipart.MultipartFile;

import com.balan.sergii.nn.dto.FileProperties;

public interface ConnectorService {
	FileProperties upload(MultipartFile fileProperties);
}
