package meercode.parser;

/**
 * Holds information the Parser needs
 * mList2d would be: false -> list; true -> 2d list
 * 
 * mASTType would be:
 * 'c' -> conditional
 * 'l' -> loop
 * 'a' -> ambiguous (possibly 'o' or 'f')
 * 
 * 'o' -> operation
 * 'f' -> function
 */
public final class ParserMeta
{
    private boolean mList2d;
    private char mASTType;
    
    public ParserMeta(boolean pList2d, char pASTType)
    {
        this.mList2d = pList2d;
        this.mASTType = pASTType;
    }
    
    public boolean getListBool()
    {
        return mList2d;
    }
    public char getASTType()
    {
        return mASTType;
    }

}