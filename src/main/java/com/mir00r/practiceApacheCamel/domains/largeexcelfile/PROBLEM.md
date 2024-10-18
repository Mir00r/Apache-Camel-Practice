### **Processing Large Excel Files**
**Problem Statement**: Your business requires the processing of large Excel files containing transactional data. The data needs to be converted to CSV and sent to a downstream system for reporting purposes.

**Solution**:
- Use Apache POI with Camel to read and process large Excel files.
- Split the Excel data into smaller CSV chunks using Camel’s split pattern to avoid memory overload.
- Send the CSV files to the reporting system via FTP or REST.
