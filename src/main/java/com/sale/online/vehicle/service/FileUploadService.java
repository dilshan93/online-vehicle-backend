package com.sale.online.vehicle.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author dilshanboteju
 */
public interface FileUploadService {

    public void save(MultipartFile file);
}
