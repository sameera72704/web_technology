***books.xsl***
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
<html>
<body>
<table border="1">
   <tr >
<th>Title</th>
<th>Author</th>
<th>ISBN</th>
<th>Publisher</th>
<th>Edition</th>
<th>Price</th>
  </tr>
<xsl:for-each select="bookstore/book">
     <tr>
<td class="Title"><xsl:value-of select="title"/></td>
<td class="Author"><xsl:value-of select="author"/></td>
<td class="ISBN"><xsl:value-of select="isbn"/></td>
<td class="Publisher"><xsl:value-of select="publisher"/></td>
<td class="Edition"><xsl:value-of select="edition"/></td>
<td class="Price"><xsl:value-of select="price"/></td>
    </tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>

