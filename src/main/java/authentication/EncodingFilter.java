package authentication;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class EncodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        // 初期化コードを記述
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // リクエストとレスポンスのエンコーディングを設定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // フィルターチェーンを実行
        chain.doFilter(request, response);
    }

    public void destroy() {
        // 終了処理を記述
    }
}