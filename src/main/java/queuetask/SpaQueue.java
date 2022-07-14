package queuetask;

public class SpaQueue {
 public String Name;
 public String Service;
 public double AppointmentTime;
//public SpaQueue(){}

    @Override
    public String toString() {
        return "SpaQueue{" +
                "Name='" + Name + '\'' +
                ", Service='" + Service + '\'' +
                ", AppointmentTime=" + AppointmentTime +
                '}';
    }

    public SpaQueue(String name, String service, double appointmentTime) {
        Name = name;
        Service = service;
        AppointmentTime = appointmentTime;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public double getAppointmentTime() {
        return AppointmentTime;
    }

    public void setAppointmentTime(double appointmentTime) {
        AppointmentTime = appointmentTime;
    }

}
