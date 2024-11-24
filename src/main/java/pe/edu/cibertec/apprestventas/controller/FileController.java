package pe.edu.cibertec.apprestventas.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.apprestventas.dto.ArchivoDto;
import pe.edu.cibertec.apprestventas.service.IFileService;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/file")
public class FileController {
    private final IFileService fileService;

    @PostMapping
    public ResponseEntity<ArchivoDto> subirArchivos(@RequestParam("files") List<MultipartFile> files) throws Exception {
        fileService.guardarArchivos(files);
        return ResponseEntity.ok().build();
    }


}
