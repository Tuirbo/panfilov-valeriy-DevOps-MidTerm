LOG_FILE="logs/Panfilov_Valeriy_system_report.log"

echo "==================================" >> $LOG_FILE
echo "Student: Valeriy Panfilov" >> $LOG_FILE
echo "Date: $(date)" >> $LOG_FILE
echo "User: $(whoami)" >> $LOG_FILE
echo "OS Kernel: $(uname -r)" >> $LOG_FILE
echo "CPU Info: $(lscpu | grep 'Model name' | head -1)" >> $LOG_FILE
echo "Memory Info:" >> $LOG_FILE
free -h >> $LOG_FILE
echo "Disk Usage:" >> $LOG_FILE
df -h / >> $LOG_FILE
echo "==================================" >> $LOG_FILE
