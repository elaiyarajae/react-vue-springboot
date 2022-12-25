import React, {useEffect, useState} from 'react';
import './EmployeeList.css';
import {getEmployees} from "../services/EmployeeService";


const EmployeeList = () => {

	const [employee, setEmployee] = useState([]);

	useEffect(()=> {
		getEmployees().then((response) => {
			setEmployee(response.data);
		}).catch(err => console.error(err));
	}, [])

	return (
		<div className="container">
			<h1 className="title">Employee List</h1>
			<table className="table table-striped">
				<thead>
				<tr>
					<th scope="col">Employee Id</th>
					<th scope="col">Employee FirstName</th>
					<th scope="col">Employee LastName</th>
					<th scope="col">Employee Email</th>
				</tr>
				</thead>
				<tbody>
				{
					employee.map(emp => {
						return (<tr key={emp.id}>
							<td>{emp.id}</td>
							<td>{emp.firstName}</td>
							<td>{emp.lastName}</td>
							<td>{emp.email}</td>
						</tr>)
					})
				}
				</tbody>
			</table>
		</div>
	)
}

export default EmployeeList;
