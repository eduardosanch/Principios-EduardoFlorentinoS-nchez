import 'package:http/http.dart' as http;
import 'dart:convert';
import '../models/tweet.dart';
import '../models/tweet_response.dart';

class TweetService{
    static final TweetService _instance = TweetService._internal();

    final String baseUrl = 'https://localhost:8080/api';
    late http.Client _httpClient;

    // private constructor
    TweetService._internal() {
        _httpClient = http.Client();
    }

    /// Factory constructor to return the singleton instance
    factory TweetService() {    
        return _instance;
    }

    // get the singleton instance 
    static TweetService getInstance() {
        return _instance;
    }   
    /// Fetch all tweets from the API
    try {
        final response = await _httpClient.get(
            Uri.parse('$baseUrl/tweets')
            );
            if (response.statusCode == 200) {
                final jsondata = jsonDecode(response.body) as Map<String, dynamic>;
                final tweetResponse = TweetResponse.fromJson(jsondata);
                return tweetResponse.content;
            } else {
                throw Exception('Failed to load tweets. Status code: ${response.statusCode}');
            }
    } catch (e) {
        print('Error fetching tweets: $e');
        throw e;
    }

    /// close the http client (cleanup)
    void dispose() {
        _httpClient.close();
    }
}