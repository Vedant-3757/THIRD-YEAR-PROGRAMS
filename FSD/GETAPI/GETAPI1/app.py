from flask import Flask,jsonify
app = Flask(__name__)
students = [
    {"id": 1, "name": "Vedant", "age": 22, "Interests": ["Coding", "Gaming", "Music"]},
    {"id": 2, "name": "Kunal", "age": 21, "Interests": ["Reading", "Traveling"]},
    {"id": 3, "name": "Datta", "age": 21, "Interests": ["Photography", "Cooking"]},
    {"id": 4, "name": "Anisha", "age": 20, "Interests": ["Dancing", "Singing"]},
    {"id": 5, "name": "Vaibhav", "age": 20, "Interests": ["Painting", "Writing"]}
]
@app.route('/students', methods=['GET'])
def get_students():
    return jsonify(students)

@app.route('/students/<int:id>', methods=['GET'])
def get_student(id):
    for student in students:
        if student['id'] == id:
            return jsonify(student)
    return jsonify({"error": "Student not found"}), 404
app.run(debug=True)
    