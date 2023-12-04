package com.emagia.master.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchProviderException;

import org.bouncycastle.openpgp.PGPException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.emagia.master.Service.PgpEncryption;

@RestController("PGPEncryption")
@RequestMapping("/ms/api/v2")
public class PgpEncryptionController {
	
	@Autowired
	PgpEncryption pgpEncryption;
	
	@GetMapping(value="/pgpEnc")  
	public void pgpenc() throws NoSuchProviderException, IOException, PGPException
	{
		String inputFile="C:\\Users\\Ravali\\Downloads\\achtest1Staples & CommercialLLC (1).ach";
		pgpEncryption.encrypt(inputFile, "C:\\Users\\Ravali\\Downloads\\achtest1StaplesEnc");
		String outputFile="C:\\Users\\Ravali\\Downloads\\resultEncrptedSecMethodAch";
		OutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile));
		//pgpEncryption.encryptFilexxxx(out, inputFile, "D:\\Ravali\\PGPencryption\\0xABA2ADAF-pub.asc");
	
	}
	
	@PostMapping(value = "/rest/upload", consumes = {
		      "multipart/form-data"
	   })
	public void fileUpload(@RequestParam("file") MultipartFile file) throws NoSuchProviderException, IOException, PGPException
	{
	String fileName=file.getOriginalFilename();
	System.out.println("fileName :"+fileName);

	}

}
