import axios from "axios";

const EMPLOYEE_GET_API_URL = "http://localhost:8080/api/employees"

export const getEmployees = () => {
	return axios.get(EMPLOYEE_GET_API_URL);
}
