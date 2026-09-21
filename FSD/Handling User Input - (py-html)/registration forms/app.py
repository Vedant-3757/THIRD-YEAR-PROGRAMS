from flask import Flask, render_template,request
app = Flask(__name__)
@app.route('/')
def home():
    return "<h1>Welcome to User Registration!</h1>"
@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        username = request.form['username']
        roll_no=request.form['roll_no']
        email=request.form['email']
        course=request.form['course']

        return f"""
        <h1>Student Details</h1>
        <p>Username: {username}</p>
        <p>Roll No: {roll_no}</p>
        <p>Email: {email}</p>
        <p>Course: {course}</p>
        <a href="/">Go Back to Homepage</a>
        """
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)