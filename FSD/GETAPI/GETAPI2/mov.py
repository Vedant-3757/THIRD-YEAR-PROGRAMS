from flask import Flask, jsonify,request
app = Flask(__name__)
movies = [
        {"id": 1, "title": "3 idiots", "category": "funny", "year": 2010},
        {"id": 2, "title": "bhagam bhag", "category": "drama", "year": 1999},
        {"id": 3, "title": "welcome", "category": "comedy", "year": 2014},
        {"id": 4, "title": "pawankhind", "category": "action", "year": 2008},
        {"id": 5, "title": "marathe", "category": "drama", "year": 1994}
    ]
@app.route('/movies', methods=['GET'])
def get_movies(): 
    return jsonify(movies)
@app.route('/movies/search', methods=['GET'])
def search_movies():
    movie_id = request.args.get('id')
    title = request.args.get('title')
    category = request.args.get('category')
    
    if movie_id:
        for movie in movies:
            if movie['movie_id'].lower() == movie_id.lower():
                return jsonify(movie)
        return jsonify({"error": "Movie not found"}), 404
    elif title:
        for movie in movies:
            if movie['title'.lower()] == title.lower():
                return jsonify(movie)
        return jsonify({"error": "Movie not found"}), 404
    elif category:
        for movie in movies:
            if movie['category'.lower()] == category.lower():
                return jsonify(movie)
        return jsonify({"error": "Movie not found"}), 404
app.run(debug=True)
