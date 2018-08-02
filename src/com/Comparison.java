package com.test.file.compare;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class Comparison {

	final static Logger logger = Logger.getLogger(Comparison.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SimpleLayout layout = new SimpleLayout();    
	    File[] folder1 = new File("C:\\Users\\x243769\\WCM\\Aug\\WCM-5554\\May_0.0").listFiles();
		File[] folder2 = new File("C:\\Users\\x243769\\WCM\\Aug\\WCM-5554\\Jul_2.0").listFiles();
		
		try
		{
		
		List folderList1 = Arrays.asList(folder1);
		List folderList2 = Arrays.asList(folder2);
		
		List newFiles = new ArrayList();
		List modifiedFiles = new ArrayList();
		List deletedFiles = new ArrayList();
		boolean lineEqual = true;
		boolean areEqual = true;
		int lineNum = 1;
		String strLine1, strLine2;
		logger.info("before invoking traverseFolders");
		Comparison compare = new Comparison();
		compare.traverseFolders(folderList1, folderList2, logger);
		logger.info("after travserseFolders");
					/*for(File file2: folder2)
					{
						try
						{
							AccessController.checkPermission(new FilePermission("C:\\Users\\x243769\\WCM\\July\\WCM-5554\\May_20_rls\\", "read,write"));
							
				            logger.info("success?");
							
							if(file1.isDirectory()){
								
								if(file2.isDirectory())
								{
								if(folder1.(file2.getName()))
								{
									logger.info("the folders are the same");
								}
								else
								{
									logger.info("the folders are different");
								}
								}
							}
							else
							{
								FileInputStream fstream1  = new FileInputStream(file1);

								FileInputStream fstream2 = new FileInputStream(file2);

								if(file1 != null && file2 != null)
								{
									logger.info("the file1 is:"+ file1.getName());
									logger.info("the file2 is :"+ file2.getName());
									//check if you are comparing the same files
									if(file1.getName() == file2.getName())
									{
										DataInputStream in1 = new DataInputStream(fstream1);
										BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
										DataInputStream in2 = new DataInputStream(fstream2);
										BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));

										//read line by line from each line
										String line1 = br1.readLine();

										String line2 = br2.readLine();

										//check if both files has some content
										while (line1 != null || line2 != null)
										{
											//check if either of lines are null then it shows that there are some missing or extra lines in one file
											if(line1 == null || line2 == null)
											{
												lineEqual = false;
												modifiedFiles.add(file1.getName());
												break;
											}
											//if both files have some lines then check if the content of the lines in both file are same
											else if(!line1.equalsIgnoreCase(line2))
											{
												lineEqual = false;
												modifiedFiles.add(file1.getName());
												break;
											}

											line1 = br1.readLine();

											line2 = br2.readLine();

											lineNum++;
										}

										//check if the content of the files are same
										if(areEqual = true)
										{
											while( ((strLine1 = br1.readLine()) != null) && ((strLine2 = br2.readLine()) != null))   {
												if(strLine1 == strLine2)
													areEqual = false;
												modifiedFiles.add(file1.getName());
											}
										}
										br1.close();
										br2.close();
									}

								}
							}

							

*/
							}
						catch (Exception e) {
							
							logger.info("the error is false");
							e.printStackTrace();
						}					
				
		
	}
	
	public void traverseFolders(List folderList1, List folderList2, Logger logger)
	{
		boolean folderMissing = false;
		logger.info("inside traverseFolders method");
		for(int i=0; i< folderList1.size(); i++){
			
			File file1 = (File) folderList1.get(i);
			
			for(int j=0; j< folderList2.size(); j++)
			{
				File file2 = (File) folderList2.get(j);
				
				if(file1.isDirectory())
				{
					System.out.println("the file1 is a dir:"+ file1.isDirectory()+" and its name is :"+ file1.getName());
					if(file2.isDirectory())
					{
						System.out.println("the file2 is a dir:"+ file2.isDirectory()+" and its name is :"+ file2.getName());
						if(file1.getName().contains(file2.getName()))
						{
							File[] folder1 = new File(file1.getAbsolutePath()).listFiles();
							File[] folder2 = new File(file2.getAbsolutePath()).listFiles();
							logger.info("after reading sub directory");
							Comparison comp = new Comparison();
							List folderLst1 = Arrays.asList(folder1);
							List folderLst2 = Arrays.asList(folder2);
							logger.info("calling the folder lists again");
							comp.traverseFolders(folderLst1, folderLst2, logger);
							
						}
						else
						{
							System.out.println("the file1 :"+ file1.getName() +" is missing or the file2 :"+ file2.getName()+" is missing");
							folderMissing = true;
						}
						
					}
					
				}
				
				/*if(file1.isDirectory())
				{
					if(file2.isDirectory())
					{
						if(!folderList1.contains(file2))
						{
							if(file1.getName().equalsIgnoreCase(file2.getName()))
							{
								File[] folder1 = new File(file1.getAbsolutePath()).listFiles();
								File[] folder2 = new File(file2.getAbsolutePath()).listFiles();
								logger.info("after reading sub directory");
								Comparison comp = new Comparison();
								List folderLst1 = Arrays.asList(folder1);
								List folderLst2 = Arrays.asList(folder2);
								logger.info("calling the folder lists again");
								comp.traverseFolders(folderLst1, folderLst2, logger);

							}
							logger.info("a new folder is present:"+ file2.getName());
						}
						else
						{
							logger.info(file1.getName()+" is present in list2 also: "+ file2.getName());
						}
						
						logger.info("the file2 directory path is: "+ file2.getAbsolutePath());
						
					}
					logger.info("The file1 is:"+file1.getName());
				}*/
			}
		}
	}
	
}
