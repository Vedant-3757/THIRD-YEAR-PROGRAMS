from flask import Flask
app=Flask(__name__)
@app.route('/')
def home():
    return """
            <h1>TY SUBJECTS ARE: </h1>
            <ol>
            <li>CORE JAVA</li>
            <li>CLOUD SECURITY</li>
            <li>WEB APPLICATION DEV</li>
            <li>FULLSTACK DEVELOPEMENT USING PYTHON</li>
            <li>.NET DEVELOPEMENT</li>
            </ol>
           """
app.run(debug=True)