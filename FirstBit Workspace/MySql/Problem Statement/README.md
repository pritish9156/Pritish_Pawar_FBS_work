# 🏥 Healthcare Management System – Database with Automated Billing

![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Status](https://img.shields.io/badge/Project-Completed-brightgreen)
![Type](https://img.shields.io/badge/Project-Academic-orange)
![Focus](https://img.shields.io/badge/Focus-Automation-red)

---

## 📖 Project Overview

This project is a real-world scalable Healthcare Management System database designed to handle:

- Patient Management  
- Doctor Management  
- Encounters (OPD & IPD)  
- Medical Records  
- Tests, Procedures & Surgeries  
- Prescription Handling  
- Insurance Claims  
- Automated Billing & Payments  

The main highlight of this system is **event-driven billing automation using Triggers, Stored Procedures, Functions and Generated Columns**.

---

## 🎯 Key Objectives

✔ Design a normalized relational database  
✔ Automate invoice generation  
✔ Achieve real-time billing calculation  
✔ Handle partial & insurance payments  
✔ Ensure data consistency  

---

## 🏗️ Database Architecture

The system is **Encounter-Centric**, meaning:

> Every hospital visit = One Encounter  
> All clinical & billing operations are linked to it.

### Core Entities

- Patient  
- Doctor  
- Encounter  
- Medical Record  
- Test & Test Report  
- Procedure & Procedure Report  
- Surgery & Surgery Report  
- Medicine & Prescription  
- Invoice & Invoice Items  
- Payment  
- Insurance & Claims  

---

## ⚙️ Billing Automation Flow

### 🧾 Step 1 – Encounter Created
Invoice is automatically generated using a trigger.

### 🧪 Step 2 – Clinical Entries Added

When these are inserted:

- Test Report  
- Procedure Report  
- Surgery Report  
- Prescription  

The corresponding charge is automatically added to the invoice.

### 💰 Step 3 – Item Total Calculation

```
total_price = quantity * unit_price
```

### 🧮 Step 4 – Invoice Total Calculation

```
total_amount = SUM(invoice_item.total_price)
```

### 🏦 Step 5 – Net Payable Auto Calculation

```sql
net_payable_amount = total_amount - discount_amount + tax_amount
```

Implemented using:

```sql
GENERATED ALWAYS AS (...) STORED
```

✔ Always consistent  
✔ No manual update required  
✔ Physically stored for performance  

---

## 🧠 Advanced SQL Concepts Used

- Triggers (event-driven automation)
- Stored Procedures
- Stored Functions
- Generated Columns
- Foreign Key Constraints
- CHECK Constraints
- Transaction-safe design
- Custom error handling using SIGNAL

---

## 🛡️ Validations Implemented

- Invalid specialization handling  
- Invalid employment type handling  
- Negative tax/discount prevention  
- Invoice existence checks  

---

## 🔍 Sample Automation Demonstration

Only inserting:

```sql
INSERT INTO encounter ...
```

Automatically:

✔ Invoice created  
✔ Invoice number generated  
✔ Billing initialized  

Adding:

```sql
INSERT INTO test_report ...
```

Automatically:

✔ Invoice item created  
✔ Total updated  

---

## 💳 Payment & Insurance Support

The system supports:

- Full payment  
- Partial payment  
- Insurance claim settlement  
- Pending amount tracking  

---

## 🚀 Features

✨ Fully automated billing  
✨ Real-time financial calculation  
✨ No redundant data storage  
✨ Scalable relational design  
✨ Production-style validations  
✨ Encounter-based workflow  

---

## 🧰 Tech Stack

- MySQL
- SQL (DDL, DML, TCL)
- Triggers
- Stored Procedures
- Stored Functions

---

## 📊 How to Run the Project

1️⃣ Import the SQL schema  
2️⃣ Insert master data:

- Patients  
- Doctors  
- Tests  
- Procedures  
- Surgeries  
- Medicines  

3️⃣ Insert an encounter  

🎯 Watch the automation happen.

---

## 🎤 Interview Ready Highlights

This project demonstrates:

- Real-world database design  
- Event-driven architecture  
- Automated billing engine  
- Transaction-safe operations  

---

## 🔮 Future Enhancements

- Medicine stock management  
- Role-based access control  
- Doctor revenue analytics  
- Monthly financial reports  
- Dashboard integration  

---

## 🏁 Conclusion

This project transforms a traditional healthcare database into an:

⚡ Intelligent  
⚡ Automated  
⚡ Consistent  
⚡ Real-time billing system  

using advanced MySQL features.

---

## 👨‍💻 Author

**Pritish Pawar**  
Final Year Project – Healthcare Management System  

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
