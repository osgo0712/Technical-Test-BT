package base;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.google.common.base.Ascii.equalsIgnoreCase;

public class BaseValidateConsumptionApis {

    String token, bookingid;

    public void getToken() {
        try {
            String servicioURL = "https://restful-booker.herokuapp.com/auth";
            String datos = "{\"username\":\"admin\", \"password\":\"password123\"}";


            // Crear objeto URL
            URL url = new URL(servicioURL);

            // Abrir conexión HTTP
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();

            // Configurar método de solicitud y otras propiedades
            conexion.setRequestMethod("POST");
            conexion.setRequestProperty("Content-Type", "application/json");
            conexion.setRequestProperty("Accept", "application/json");
            conexion.setDoOutput(true);

            // Datos a enviar en el cuerpo de la solicitud (en formato JSON)

            // Enviar datos al servidor
            DataOutputStream wr = new DataOutputStream(conexion.getOutputStream());
            wr.writeBytes(datos);
            wr.flush();
            wr.close();

            // Leer la respuesta del servicio
            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();


            // Imprimir la respuesta del servicio
            int codigoRespuesta = conexion.getResponseCode();
            String codRespuesta = Integer.toString(codigoRespuesta);
            equalsIgnoreCase(codRespuesta,"200");
            System.out.println("***************************************************************************************");
            System.out.println("[CODIGO DE RESPUESTA:] - RESPONSE: "+codRespuesta);
            System.out.println("[GENERATE TOKEN] - RESPONSE: "+response.toString());
            System.out.println("***************************************************************************************");




            token = response.toString().substring(10,25);
            // Cerrar la conexión
            conexion.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createBooking() {
        try {
            String servicioURL = "https://restful-booker.herokuapp.com/booking";
            String datos = "{\n" +
                    "    \"firstname\" : \"Pedro\",\n" +
                    "    \"lastname\" : \"Gutierrez\",\n" +
                    "    \"totalprice\" : 100,\n" +
                    "    \"depositpaid\" : true,\n" +
                    "    \"bookingdates\" : {\n" +
                    "        \"checkin\" : \"2024-03-01\",\n" +
                    "        \"checkout\" : \"2024-04-01\"\n" +
                    "    },\n" +
                    "    \"additionalneeds\" : \"Comics\"\n" +
                    "}";


            // Crear objeto URL
            URL url = new URL(servicioURL);

            // Abrir conexión HTTP
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();

            // Configurar método de solicitud y otras propiedades
            conexion.setRequestMethod("POST");
            conexion.setRequestProperty("Content-Type", "application/json");
            conexion.setRequestProperty("Accept", "application/json");
            conexion.setDoOutput(true);

            // Datos a enviar en el cuerpo de la solicitud (en formato JSON)

            // Enviar datos al servidor
            DataOutputStream wr = new DataOutputStream(conexion.getOutputStream());
            wr.writeBytes(datos);
            wr.flush();
            wr.close();

            // Leer la respuesta del servicio
            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String inputLine;

            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Imprimir la respuesta del servicio
            int codigoRespuesta = conexion.getResponseCode();
            String codRespuesta = Integer.toString(codigoRespuesta);
            equalsIgnoreCase(codRespuesta,"200");
            System.out.println("***************************************************************************************");
            System.out.println("[CODIGO DE RESPUESTA:] - RESPONSE: "+codRespuesta);
            System.out.println("[CREATE BOOKING] - RESPONSE: "+response.toString());
            System.out.println("***************************************************************************************");
            bookingid = response.toString().substring(13, 17).replace(",", "");

            // Cerrar la conexión
            conexion.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getBooking() {
        try {
            String servicioURL = "https://restful-booker.herokuapp.com/booking/"+bookingid;

            // Crear objeto URL
            URL url = new URL(servicioURL);

            // Abrir conexión HTTP
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();

            // Configurar método de solicitud y otras propiedades
            conexion.setRequestMethod("GET");
            conexion.setRequestProperty("Content-Type", "application/json");
            conexion.setRequestProperty("Accept", "application/json");

            // Leer la respuesta del servicio
            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String inputLine;

            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Imprimir la respuesta del servicio
            int codigoRespuesta = conexion.getResponseCode();
            String codRespuesta = Integer.toString(codigoRespuesta);
            equalsIgnoreCase(codRespuesta,"200");
            System.out.println("***************************************************************************************");
            System.out.println("[CODIGO DE RESPUESTA:] - RESPONSE: "+codRespuesta);
            System.out.println("[GET BOOKING] - RESPONSE: "+response.toString());
            System.out.println("***************************************************************************************");


            // Cerrar la conexión
            conexion.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateBooking() {
        try {
            String servicioURL = "https://restful-booker.herokuapp.com/booking/"+bookingid;

            String datos = "{\n" +
                    "    \"firstname\" : \"Jose\",\n" +
                    "    \"lastname\" : \"Gutierrez\",\n" +
                    "    \"totalprice\" : 100,\n" +
                    "    \"depositpaid\" : true,\n" +
                    "    \"bookingdates\" : {\n" +
                    "        \"checkin\" : \"2023-05-12\",\n" +
                    "        \"checkout\" : \"2023-06-28\"\n" +
                    "    },\n" +
                    "    \"additionalneeds\" : \"Terror\"\n" +
                    "}";


            // Crear objeto URL
            URL url = new URL(servicioURL);

            // Abrir conexión HTTP
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();

            // Configurar método de solicitud y otras propiedades
            conexion.setRequestMethod("PUT");
            conexion.setRequestProperty("Content-Type", "application/json");
            conexion.setRequestProperty("Accept", "application/json");
            conexion.setRequestProperty("Cookie", "token="+token);
            conexion.setDoOutput(true);

            // Datos a enviar en el cuerpo de la solicitud (en formato JSON)

            // Enviar datos al servidor
            DataOutputStream wr = new DataOutputStream(conexion.getOutputStream());
            wr.writeBytes(datos);
            wr.flush();
            wr.close();

            // Leer la respuesta del servicio
            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String inputLine;

            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Imprimir la respuesta del servicio
            int codigoRespuesta = conexion.getResponseCode();
            String codRespuesta = Integer.toString(codigoRespuesta);
            equalsIgnoreCase(codRespuesta,"200");
            System.out.println("***************************************************************************************");
            System.out.println("[CODIGO DE RESPUESTA:] - RESPONSE: "+codRespuesta);
            System.out.println("[UPDATE BOOKING] - RESPONSE: "+response.toString());
            System.out.println("***************************************************************************************");


            // Cerrar la conexión
            conexion.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBooking() {
        try {
            String servicioURL = "https://restful-booker.herokuapp.com/booking/"+bookingid;

            // Crear objeto URL
            URL url = new URL(servicioURL);

            // Abrir conexión HTTP
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();

            // Configurar método de solicitud y otras propiedades
            conexion.setRequestMethod("DELETE");
            conexion.setRequestProperty("Content-Type", "application/json");
            conexion.setRequestProperty("Accept", "application/json");
            conexion.setRequestProperty("Cookie", "token="+token);

            // Leer la respuesta del servicio
            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String inputLine;

            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Imprimir la respuesta del servicio
            int codigoRespuesta = conexion.getResponseCode();
            String codRespuesta = Integer.toString(codigoRespuesta);
            equalsIgnoreCase(codRespuesta,"200");
            System.out.println("***************************************************************************************");
            System.out.println("[CODIGO DE RESPUESTA:] - RESPONSE: "+codRespuesta);
            System.out.println("[DELETE BOOKING] - RESPONSE: "+response.toString());
            System.out.println("***************************************************************************************");


            // Cerrar la conexión
            conexion.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
