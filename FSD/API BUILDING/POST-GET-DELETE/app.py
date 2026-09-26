from flask import Flask, request, jsonify
app = Flask(__name__)
students = []
@app.route('/students', methods=['POST'])
def create_student():
    data = request.get_json()
    students.append(data)
    return jsonify(
        {"message": "Student created successfully", 
         "student": data}
        ), 201
@app.route('/students', methods=['GET'])
def get_students():
    return jsonify(students), 200
@app.route('/students/<int:id>', methods=['DELETE'])
def delete_student(id):
    for student in students:
        if student['id'] == id:
            students.remove(student)
            return jsonify({"message": "Student deleted successfully"}), 200
    return jsonify({"message": "Student not found",
                    "student": data},
                   ), 404
app.run(debug=True)