from flask import Flask, request, jsonify
app=Flask(__name__)
students = []
@app.route('/student', methods=['GET'])
def get_students():
    return jsonify(students)
@app.route  ('/student', methods=['POST'])
def add_student():
    if request.method=="POST":
        data = request.get_json()
        students.append(data)
    return jsonify({ "message": "Student created successfully", "student": data }), 201
app.run(debug=True)