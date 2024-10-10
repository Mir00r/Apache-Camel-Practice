### **File Processing and Transformation**
**Problem Statement**: You need to monitor an FTP directory where files are uploaded by different users daily. The files are in XML format, but your system requires them to be in JSON format. Additionally, large files need to be split into smaller chunks to avoid memory overload before transforming them.

**Solution**:
- Use Camel to poll the FTP directory and monitor new files.
- Implement a Camel route to process the XML files, transform them into JSON, and split large files into smaller chunks.
- Use Apache POI or Jackson for data transformation and Camel’s FTP component to monitor the directory.
