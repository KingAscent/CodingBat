# Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
# and a boolean indicating if we are on vacation, return a string of
# the form "7:00" indicating when the alarm clock should ring. Weekdays,
# the alarm should be "7:00" and on the weekend it should be "10:00". Unless
# we are on vacation -- then on weekdays it should be "10:00" and weekends it
# should be "off".

def alarm_clock(day, vacation):
  # Check if we are on vacation, and if so, return the proper time for alarm
  if(vacation):
    if((1 <= day) and (day <= 5)):
      return '10:00'
    return 'off'
  
  # If we are not on vacation, return the proper time for the alarm
  if((1 <= day) and (day <= 5)):
    return '7:00'
  return '10:00'
