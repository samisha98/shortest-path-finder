package com.example.sai.myapplication.Dijk;

import android.util.Log;

/**
 * Created by Sai on 28-Oct-17.
 */

public class Main {

        public  void hello (int src,int dest)
        {
            //Log.d("shreya","main");

            int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0},
                    {4, 0, 8, 0, 0, 0, 0},
                    {0, 8, 0, 7, 0, 4, 0},
                    {0, 0, 7, 0, 9, 14, 0},
                    {0, 0, 0, 9, 0, 10, 0},
                    {0, 0, 4, 14, 10, 0, 2},
                    {0, 0, 0, 0, 0, 2, 0}

            /*
            int graph[][]=new int[][]{{0,8,7},
                    {8,0,7},
                    {0,7,0}
                    */
            };
            ShortestPath t = new ShortestPath();

            t.dijkstra(graph, src,dest);
            Log.d("shreya",t.ans);
            //t.updatetextview(t.ans);
        }
    }

