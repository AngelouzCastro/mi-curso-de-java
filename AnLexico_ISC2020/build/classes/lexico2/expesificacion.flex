package lexico2;

class Yytoken {
    Yytoken (int numToken, String text, String field, int line, int charBegin){
        m_numToken = numToken;
        m_text = new String (text);
        m_field = field;
        m_line = line;
        m_charBegin = charBegin;
    }

    public int m_numToken;
    public String m_text;
    public String m_field;
    public int m_line;
    public int m_charBegin;

}