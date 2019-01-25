<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

    <xsl:output method="text" />

    <xsl:template match="article">

        <xsl:apply-templates />

    </xsl:template>

    <xsl:template match="title">

        <xsl:apply-templates />

    </xsl:template>

    <xsl:template match="p">

        <xsl:apply-templates />
    </xsl:template>

    <xsl:template match="br">
        <xsl:text>&#xa;</xsl:text>
    </xsl:template>

</xsl:stylesheet>