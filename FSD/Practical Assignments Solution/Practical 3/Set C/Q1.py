from flask import Flask
import platform
app = Flask(__name__)
@app.route('/')
def system():
    return f"""
    <h1>System Information</h1>
    <p><b>Operating System:</b> {platform.system()}</p>
    <p><b>OS Version:</b> {platform.version()}</p>
    <p><b>Machine:</b> {platform.machine()}</p>
    <p><b>Processor:</b> {platform.processor()}</p>
    <p><b>Python Version:</b> {platform.python_version()}</p>
    """
app.run(debug=True)