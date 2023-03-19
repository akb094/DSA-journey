#define the offset between GMT and IST
offset = 5.5

#get the current GMT time
gmt_time = input("Enter the GMT time (DD HH:MM:SS): ")

#split the input into days, hours, minutes, and seconds
gmt_time_list = gmt_time.split()
gmt_day = int(gmt_time_list[0])
gmt_time_list = gmt_time_list[1].split(':')

#convert the input to hours, minutes, and seconds
gmt_hours = int(gmt_time_list[0])
gmt_minutes = int(gmt_time_list[1])
gmt_seconds = int(gmt_time_list[2])

#add the offset to the GMT time
ist_day = gmt_day
ist_hours = (gmt_hours + offset) % 24
ist_minutes = gmt_minutes
ist_seconds = gmt_seconds

#if ist_hours < 0, it means we have crossed to previous day
if ist_hours < 0:
    ist_hours += 24
    ist_day -= 1

#print the IST time
print(ist_hours)
print(ist_day)
print(ist_minutes)
print(ist_seconds)
