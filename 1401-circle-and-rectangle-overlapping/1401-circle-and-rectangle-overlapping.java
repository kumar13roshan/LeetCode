class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closetX=Math.max(x1,Math.min(xCenter,x2));
        int closetY=Math.max(y1,Math.min(yCenter,y2));

        int dx=xCenter-closetX;
        int dy=yCenter-closetY;

        return dx*dx+dy*dy <= radius*radius;

    }
}